import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Car} from "../model/car";

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private httpClient: HttpClient) {
  }


  findAll(): Observable<any> {
    return this.httpClient.get("http://localhost:8080/list");
  }

  findById(number: number): Observable<any> {
    return this.httpClient.get("http://localhost:3000/xe/" + number);
  }

  update(value: any) {
    return this.httpClient.patch("http://localhost:3000/xe/" + value.id, value);
  }

  delete(idDelete: number, xeDelete: Car) {
    return this.httpClient.patch('http://localhost:8080/delete/' + idDelete, xeDelete);
  }

  create(car: Car) {
    console.log(car)
    return this.httpClient.post("http://localhost:8080",car);
  }
}
