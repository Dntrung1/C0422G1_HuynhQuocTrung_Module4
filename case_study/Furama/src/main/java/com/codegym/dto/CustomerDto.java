package com.codegym.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CustomerDto {
    private Integer idCustomer;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^([A-VXYỲỌÁẦẢẤỜỄÀẠẰỆẾÝỘẬỐŨỨĨÕÚỮỊỖÌỀỂẨỚẶÒÙỒỢÃỤỦÍỸẮẪỰỈỎỪỶỞÓÉỬỴẲẸÈẼỔẴẺỠƠÔƯĂÊÂĐ]{1})([a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+)((\\s{1}([A-VXYỲỌÁẦẢẤỜỄÀẠẰỆẾÝỘẬỐŨỨĨÕÚỮỊỖÌỀỂẨỚẶÒÙỒỢÃỤỦÍỸẮẪỰỈỎỪỶỞÓÉỬỴẲẸÈẼỔẴẺỠƠÔƯĂÊÂĐ]{1})[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+))+$",
            message = "Tên khách hàng không được chứa số. Và các kí tự đầu tiên của mỗi từ phải\n")
    private String customerName;
    private String birthday;
    private boolean gender;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^\\d{9,12}$", message = "Số CMND phải đúng định dạng XXXXXXXXX hoặc XXXXXXXXXXXX\n" +
            "(X là số 0-9),9-12 số")
    private String idCard;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^(0|\\(84\\)\\+)(90|91)\\d{7}$", message = "Số điện thoại phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc\n" +
            "(84)+90xxxxxxx hoặc (84)+91xxxxxxx.")
    private String phone;
    @NotBlank(message = "Không được để trống")
    @Email
    private String email;
    @NotBlank(message = "Không được để trống")
    private String address;
    private boolean customerStatus;
    private CustomerTypeDto customerTypeDto;

    public CustomerDto() {
    }

    public CustomerDto(Integer idCustomer, String customerName, String birthday, boolean gender, String idCard,
                       String phone, String email, String address, boolean customerStatus, CustomerTypeDto customerTypeDto) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerStatus = customerStatus;
        this.customerTypeDto = customerTypeDto;
    }

    public CustomerTypeDto getCustomerTypeDto() {
        return customerTypeDto;
    }

    public void setCustomerTypeDto(CustomerTypeDto customerTypeDto) {
        this.customerTypeDto = customerTypeDto;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(boolean customerStatus) {
        this.customerStatus = customerStatus;
    }
}
