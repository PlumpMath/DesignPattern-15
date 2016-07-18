package com.command.example;

/**
 * Created by toryang on 7/14/16.
 */
public class DeleteRequirementCommand extends Command {

    @Override
    public void execute() {
        super.rg.find();
        super.rg.delete();
        super.rg.plan();
    }
}
