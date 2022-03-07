package com.dma.tpfinal.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;


@Entity(tableName = "OPCrossRef_table",primaryKeys= {"productIdRef","orderIdRef"},
        foreignKeys = {
        @ForeignKey(entity = Product.class,parentColumns = "productIdRef", childColumns = "productIdRef",onDelete = 1,onUpdate = 1,deferred=false),
        @ForeignKey(entity = Order.class, parentColumns = "orderIdRef", childColumns = "orderIdRef",onDelete = 1,onUpdate = 1,deferred=false)
                    })
public class CrossRef {
    @ColumnInfo(index = true, name = "productIdRef")
    public long productIdRef;
    @ColumnInfo(index = true, name ="orderIdRef")
    public long orderIdRef;


    public void CrossRef(long productId, long orderId){
        this.productIdRef = productId;
        this.orderIdRef = orderId;
    }

    public long getOrderIdRef() {
        return orderIdRef;
    }

    public long getProductIdRef() {
        return productIdRef;
    }

}






