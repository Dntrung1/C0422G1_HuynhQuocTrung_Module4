import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CarComponent} from "./car/car.component";
import {CarCreateComponent} from "./car-create/car-create.component";


const routes: Routes = [
  {path: "", component: CarComponent},
  {path: "create", component: CarCreateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
