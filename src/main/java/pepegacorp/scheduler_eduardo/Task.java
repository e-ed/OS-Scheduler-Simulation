/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pepegacorp.scheduler_eduardo;

/**
 *
 * @author eduardo
 */
public abstract class Task {
    private TaskNames name;
    private int duration;

    public TaskNames getName() {
        return name;
    }

    public void setName(TaskNames name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
