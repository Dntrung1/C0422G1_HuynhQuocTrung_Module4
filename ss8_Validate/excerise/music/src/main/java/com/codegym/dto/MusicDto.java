package com.codegym.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MusicDto {
    @NotBlank(message = "Vui Lòng không bỏ trống")
    @Size(max = 800, message = "Không được vướt quá 800 ký tự")
    @Pattern(regexp = "^[A-Za-z0-9 ]*$", message = "Không nhập ký tự đặc biệt")
    private String nameMusic;
    @NotBlank(message = "Vui Lòng không bỏ trống")
    @Size(max = 300, message = "Không được vướt quá 300 ký tự")
    @Pattern(regexp = "^[A-Za-z0-9 ]*$", message = "Không nhập ký tự đặc biệt")
    private String singer;
    @NotBlank(message = "Vui Lòng không bỏ trống")
    @Size(max = 1000, message = "Không được vướt quá 1000 ký tự")
    @Pattern(regexp = "^[A-Za-z0-9 \\,]*$", message = "Không nhập ký tự đặc biệt. Ngoại trừ dấu phẩy")
    private String kindOfMusic;

    public MusicDto() {
    }

    public MusicDto(String nameMusic, String singer, String kindOfMusic) {
        this.nameMusic = nameMusic;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
