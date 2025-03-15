package ParkingLot.models;

import java.io.*;
import java.util.*;

public class Operator extends BaseModel{
    private String name;
    private int empId;  //! why do we need this when we already have an id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
