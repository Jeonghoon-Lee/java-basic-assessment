/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hoon.classroster;

import com.hoon.classroster.controller.ClassRosterController;
import com.hoon.classroster.dao.ClassRosterDao;
import com.hoon.classroster.dao.ClassRosterDaoFileImpl;
import com.hoon.classroster.ui.ClassRosterView;
import com.hoon.classroster.ui.UserIO;
import com.hoon.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Jeonghoon
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();

        ClassRosterController controller = new ClassRosterController(myView, myDao);

        controller.run();
    }
}
