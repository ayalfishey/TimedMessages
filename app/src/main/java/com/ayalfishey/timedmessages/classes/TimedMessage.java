package com.ayalfishey.timedmessages.classes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.ayalfishey.timedmessages.classes.data.DateConverter;

import java.util.Date;


@Entity(tableName = "TimedMessages")
@TypeConverters({DateConverter.class})
public class TimedMessage {

    @PrimaryKey (autoGenerate = true)
    int id;

    private String message;
    private String receiverNo;
    private Date sendDate;

    public TimedMessage(String message, String receiverNo, Date sendDate) {
        this.message = message;
        this.receiverNo = receiverNo;
        this.sendDate = sendDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }


    public String getReceiverNo() {
        return receiverNo;
    }

    public void setReceiverNo(String receiverNo) {
        this.receiverNo = receiverNo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
