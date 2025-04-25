package models;

import jakarta.persistence.*;


@Entity
@Table(name = "billable_task") // Tabla de la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BillableTask extends Task {

    private int hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title,String date, boolean state, int hourlyRate) {
        super(title, date,state);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "BillableTask{" +
                super.toString() +
                "hourlyRate=" + hourlyRate +
                ", title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", state=" + isState() +
                '}';
    }
}