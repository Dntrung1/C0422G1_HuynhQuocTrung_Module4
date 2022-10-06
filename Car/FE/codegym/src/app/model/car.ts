import {DiaDiem} from "./dia-diem";

export interface Car {
  id?: number,
  soXe?: string,
  loaiXe?: string,
  tenNhaXe?: string,
  diemDi?: DiaDiem,
  diemDen?: DiaDiem,
  soDienThoai?: string,
  email?: string,
  gioDi?: string,
  gioDen?: string
  trangThai?: boolean
}
