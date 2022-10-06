package com.codegym.repository;

import com.codegym.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICarRepository extends JpaRepository<Car, Integer> {
    @Query(value = "SELECT \n" +
            "    *\n" +
            "FROM\n" +
            "    xe\n" +
            "        JOIN\n" +
            "    dia_diem ON xe.diem_di = dia_diem.id", nativeQuery = true)
    Page<Car> findAllCar(Pageable pageable);

    @Modifying
    @Query(value = "update xe set xe.trang_thai = 1 where xe.id = :idDelete", nativeQuery = true)
    void deleteCar(@Param("idDelete") int id);

    @Modifying
    @Query(value = "INSERT INTO xe (`email`, `gio_den`, `gio_di`, `loai_xe`, `so_dien_thoai`, `so_xe`, " +
            "`ten_nha_xe`, `trang_thai`, `diem_den`, `diem_di`) VALUES " +
            "(:email,:gioDen, :gioDi, :loaiXe, :soDienThoai, :soXe, :tenNhaXe, 0, :diemDen, :diemDi ) "
            , nativeQuery = true)
    void createCar(@Param("email") String email,@Param("gioDen") String gioDen,@Param("gioDi") String gioDi
    ,@Param("loaiXe") String loaiXe, @Param("soDienThoai") String soDienThoai, @Param("soXe") String soXe
    ,@Param("tenNhaXe") String tenNhaXe,@Param("diemDen") int diemDen,@Param("diemDi") int diemDi);
}
