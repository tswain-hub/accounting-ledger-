package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
;

public class Transaction {

    private final LocalDate;
    private final LocalTime time;
    private final String description;
    private final String vendor;
    private final BigDecimal amount;


    // Only one constructor
    public Transaction(LocalDate date, LocalTime time,
                       String description, String vendor,
                       BigDecimal amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }// Getters
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public BigDecimal getAmount() {
        return amount;

        // toString method

        String toString; {

            return  date + "|" +
                    time + "|" +
                    description + "|" +
                    vendor + "|" +
                    amount.setScale(2).toPlainString();
        }

    }
    }
}

