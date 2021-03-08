package io.github.chris2011.netbeans.plugins.consolebeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@ActionID(
    category = "Window",
    id = "io.github.chris2011.netbeans.plugins.consolebeans.ConsoleWindowAction"
)
@ActionRegistration(
    displayName = "#CTL_ConsoleWindowAction"
)
//@ActionReference(path = "Menu/Window/IDE Tools", position = 3333)
@Messages("CTL_ConsoleWindowAction=Integrated Console")
public final class ConsoleWindowAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FileSystem memoryFileSystem = FileUtil.createMemoryFileSystem();
        
        memoryFileSystem.
                
//        TopComponent consoleTopComponent = new ConsoleTopComponent();
//
//        consoleTopComponent.open();
//        consoleTopComponent.requestActive();
//        consoleTopComponent.grabFocus();
;
    }
}
