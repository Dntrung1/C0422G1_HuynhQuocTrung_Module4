package com.codegym.model.contact;

import javax.persistence.*;

@Entity
@Table(name = "contact_detail")
public class ContactDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "attach_facility", referencedColumnName = "id")
    private AttachFacility attachFacility;

    @ManyToOne
    @JoinColumn(name = "contact", referencedColumnName = "idContact")
    private Contact contact;

    public ContactDetail() {
    }

    public ContactDetail(int id, int quantity, AttachFacility attachFacility, Contact contact) {
        this.id = id;
        this.quantity = quantity;
        this.attachFacility = attachFacility;
        this.contact = contact;
    }

    public ContactDetail(int quantity, AttachFacility attachFacility, Contact contact) {
        this.quantity = quantity;
        this.attachFacility = attachFacility;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
