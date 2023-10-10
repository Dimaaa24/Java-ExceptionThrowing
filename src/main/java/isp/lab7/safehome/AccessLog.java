package isp.lab7.safehome;

import java.time.LocalDateTime;

public class AccessLog
{
    private String tenantName;
    private LocalDateTime  dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;
    AccessLog(String name,LocalDateTime date,String op,DoorStatus door,String error)
    {
        tenantName=name;
        dateTime=date;
        operation=op;
        doorStatus=door;
        errorMessage=error;
    }

    public String toString()
    {
        return "LOG:"+tenantName+" "+dateTime+" "+operation+" "+doorStatus+" "+errorMessage;
    }
}
