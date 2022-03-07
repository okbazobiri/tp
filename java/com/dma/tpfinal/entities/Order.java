package com.dma.tpfinal.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Entity(tableName ="order_table")
public class Order {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = "orderIdRef")
    public long orderIdRef;
    @ColumnInfo(name = "quantity")
    public int orderQuantity;
    public String orderDate;

    public Order(){}


    public DateFormat getOrderDate() {
        DateFormat date = new SimpleDateFormat("hh:mm dd/mm/yyyy");
        return date;
    }



    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setOrderID(long orderId) {
        this.orderIdRef = orderId;
    }

    public long getOrderID() {
        return orderIdRef;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
}
