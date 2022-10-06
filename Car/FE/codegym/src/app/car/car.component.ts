import { Component, OnInit } from '@angular/core';
import {Car} from "../model/car";
import {CarService} from "../service/car.service";

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  xeDelete: Car;
  xes: Car[] = [];
  idDelete: number;
  soXeDelete: string;
  constructor(private carService: CarService) { }

  ngOnInit(): void {
    this.findAll()
  }

  findAll() {
    this.carService.findAll().subscribe(next => {
      if (next.content)
      this.xes = next.content;
      console.log(this.xes)
    })
  }

  // delete(id: number, soXe: string) {
  //   this.idDelete = id;
  //   this.soXeDelete = soXe;
  // }

  // submitDelete(idDelete: number) {
  //   this.carService.delete(idDelete).subscribe(n => {
  //     this.findAll();
  //   })
  // }

  delete(id: number, soXe: string, xe: Car) {
    this.idDelete = id;
    this.soXeDelete = soXe;
    this.xeDelete = xe;
  }

  submitDelete(idDelete: number, xeDelete: Car) {
    this.carService.delete(idDelete,xeDelete).subscribe(n => {
      this.findAll()
    })
  }
}
