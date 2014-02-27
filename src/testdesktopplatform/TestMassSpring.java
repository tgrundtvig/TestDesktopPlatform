/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdesktopplatform;

import applicationapi.Application;
import applicationapi.Platform;
import desktopplatform.DesktopPlatformImpl;
import lunarlander.LunarLander;
import massspringsystem.MassSpringApplication;



/**
 *
 * @author tog
 */
public class TestMassSpring
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application app = new MassSpringApplication();
        Platform p = new DesktopPlatformImpl();
        
        p.runApplication(app);
    }
    
}
