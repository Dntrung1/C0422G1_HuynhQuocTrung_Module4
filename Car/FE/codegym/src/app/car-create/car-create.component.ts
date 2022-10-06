import { Component, OnInit } from '@angular/core';
import {DiaDiemService} from "../service/dia-diem.service";
import {CarService} from "../service/car.service";
import {DiaDiem} from "../model/dia-diem";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {Car} from "../model/car";

@Component({
  selector: 'app-car-create',
  templateUrl: './car-create.component.html',
  styleUrls: ['./car-create.component.css']
})
export class CarCreateComponent implements OnInit {
  address: DiaDiem[] = [];
  carCreate: FormGroup;
  constructor(private diaDiemService: DiaDiemService, private carService: CarService, private router: Router) {
    this.carCreate = new FormGroup({
      id: new FormControl(""),
      soXe: new FormControl(""),
      loaiXe: new FormControl("", [Validators.required]),
      tenNhaXe: new FormControl("", [Validators.required]),
      diemDi: new FormGroup({
        id: new FormControl("", [Validators.required])
      }),
      diemDen: new FormGroup({
        id: new FormControl("", [Validators.required])
      }),
      soDienThoai: new FormControl("", [Validators.required]),
      email: new FormControl("", [Validators.required, Validators.email]),
      gioDi: new FormControl("", [Validators.required]),
      gioDen: new FormControl("", [Validators.required]),
      trangThai: new FormControl(""),
    })
  }

  ngOnInit(): void {
    this.getAllAddress()
  }
  getAllAddress(){
    this.diaDiemService.findAll().subscribe(n => {
      this.address = n;
    })
  }

  create() {
    const createCar: Car = this.carCreate.value;
    this.carService.create(createCar).subscribe(n => {
        this.router.navigateByUrl("");
    },error => {
      console.log(1321)
    })
  }
}
