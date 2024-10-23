package entities;

import java.time.LocalDate;

public class Expense {
   private Double value;
   private  String description;
   private LocalDate date;

   public Expense(Double value, String description, LocalDate date) {
      this.value = value;
      this.description = description;
       this.date = date;
   }

   public Double getValue() {
      return value;
   }

   public void setValue(Double value) {
      this.value = value;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }
}
