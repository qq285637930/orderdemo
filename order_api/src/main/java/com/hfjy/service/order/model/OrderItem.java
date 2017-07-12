package com.hfjy.service.order.model;

import java.util.Date;

public class OrderItem {
    /**
     * id : 
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * order_id : 订单ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * order_sn : 订单编号
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     * produce_id : 商品ID
     *
     * @mbg.generated
     */
    private Long produceId;

    /**
     * name : 商品名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * price : 价格
     *
     * @mbg.generated
     */
    private Long price;

    /**
     * item_number : 数量
     *
     * @mbg.generated
     */
    private Integer itemNumber;

    /**
     * comment : 备注
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * create_time : 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * update_time : 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * @return the value of order_item.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id the value for order_item.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return the value of order_item.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     *
     * @param orderId the value for order_item.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     *
     * @return the value of order_item.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     *
     * @param orderSn the value for order_item.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     *
     * @return the value of order_item.produce_id
     *
     * @mbg.generated
     */
    public Long getProduceId() {
        return produceId;
    }

    /**
     *
     * @param produceId the value for order_item.produce_id
     *
     * @mbg.generated
     */
    public void setProduceId(Long produceId) {
        this.produceId = produceId;
    }

    /**
     *
     * @return the value of order_item.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name the value for order_item.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *
     * @return the value of order_item.price
     *
     * @mbg.generated
     */
    public Long getPrice() {
        return price;
    }

    /**
     *
     * @param price the value for order_item.price
     *
     * @mbg.generated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     *
     * @return the value of order_item.item_number
     *
     * @mbg.generated
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    /**
     *
     * @param itemNumber the value for order_item.item_number
     *
     * @mbg.generated
     */
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     *
     * @return the value of order_item.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment the value for order_item.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     *
     * @return the value of order_item.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @param createTime the value for order_item.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @return the value of order_item.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @param updateTime the value for order_item.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", produceId=").append(produceId);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", itemNumber=").append(itemNumber);
        sb.append(", comment=").append(comment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}