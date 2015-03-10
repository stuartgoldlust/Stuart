/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-9 LearningPatterns Inc.
 */

package com.javatunes.persist;

import javax.persistence.*;

@Entity
@Table(name="INVENTORY")
public class Inventory
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="INV_ID")
   private Long       id;

   private String     location;
   private int        quantity;
   
   @Version
   private int        version;   
   
   // TODO - Declare a field to hold a MusicItem for the Inventory-MusicItem relationship
   // TODO - Declare getter and setter methods for this field
   @ManyToOne
   @JoinColumn(name="ITEM_ID")
   private MusicItem       item;
   public MusicItem getItem() { return item; }
   public void setItem(MusicItem mi)  { item = mi; }
   
   public Inventory() {}

   public Inventory(String location, int quantity) {
       // Set the location and quantity	
	   setLocation(location);
	   setQuantity(quantity);
   }


   public Long getId() { return id; }
   public String getLocation() { return location; }
   public int    getQuantity() { return quantity; }
   public int getVersion() { return version; }

   public void setLocation(String loc)    { location = loc; }
   public void setQuantity(int q)         { quantity = q; }

   // Override Object.toString()
   public String toString() {
      return this.getClass().getName() +
         ": location=" + this.getLocation() +
         ": quantity=" + this.getQuantity();
   }

}
