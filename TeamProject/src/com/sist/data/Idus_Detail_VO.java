
package com.sist.data;
/*
 * cno
title
username
price
score
DeliveryFee
DeliveryDay
Quantity
totla price

option - Jbox

JButton
장바구니
구매하기
선물하기

 */

public class Idus_Detail_VO {
   private int cno;
   private String title;
   private String username;
   private String price;
   private double score;
   private String DeliveryFee;
   private String DeliveryDay;
   private String Quantity;
   private int TotalPrice;
   public int getCno() {
      return cno;
   }
   public void setCno(int cno) {
      this.cno = cno;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getUsername() {
      return username;
   }
   public void setUsername(String username) {
      this.username = username;
   }
   public String getPrice() {
      return price;
   }
   public void setPrice(String price) {
      this.price = price;
   }
   public double getScore() {
      return score;
   }
   public void setScore(double score) {
      this.score = score;
   }
   public String getDeliveryFee() {
      return DeliveryFee;
   }
   public void setDeliveryFee(String deliveryFee) {
      DeliveryFee = deliveryFee;
   }
   public String getDeliveryDay() {
      return DeliveryDay;
   }
   public void setDeliveryDay(String deliveryDay) {
      DeliveryDay = deliveryDay;
   }
   public String getQuantity() {
      return Quantity;
   }
   public void setQuantity(String quantity) {
      Quantity = quantity;
   }
   public int getTotalPrice() {
      return TotalPrice;
   }
   public void setTotalPrice(int totalPrice) {
      TotalPrice = totalPrice;
   }
}