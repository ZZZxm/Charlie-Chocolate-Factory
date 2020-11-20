package team.charliechocolatefactory.supplement.handmadetool;

import java.util.Date;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname HandmadeTool
 * @description Handmade tool class. This is a part of COW pattern.
 * @date 2020/11/18 10:09
 */
public class HandmadeTool {

    private final long batchNumber;
    private String description = "Defalut description.";
    private int refCount = 0;

    /**
     * default ctor
     */
    public HandmadeTool() {
        batchNumber = new Date().getTime();
        System.out.println("New Handmade Tool!");
    }

    /**
     * copy ctor
     *
     * @param tool tool to copy
     */
    public HandmadeTool(HandmadeTool tool) {
        batchNumber = tool.batchNumber;
        description = tool.description;
        System.out.println("Copy Handmade Tool!");
    }

    /**
     * @return the batchNumber
     */
    public long getBatchNumber() {
        return batchNumber;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the refCount
     */
    public int getRefCount() {
        return refCount;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * dereference
     */
    public void deref() {
        refCount--;
    }

    /**
     * increace reference
     */
    public void ref() {
        refCount++;
    }

}
