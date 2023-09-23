/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pepegacorp.scheduler_eduardo;

/**
 *
 * @author eduardo
 */
public class CPU {
    private Task activeTask;

    public Task getActiveTask() {
        return activeTask;
    }

    public void setActiveTask(Task activeTask) {
        this.activeTask = activeTask;
    }

    public CPU() {
        this.activeTask = null;
    }
    
    public void executeInstructions() {
        this.activeTask.setDuration(activeTask.getDuration() - 1);
    }
            
    
    
}
