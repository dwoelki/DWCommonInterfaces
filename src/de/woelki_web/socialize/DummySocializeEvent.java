/* CHANGELOG
 * 2019-05-13   DW  
 */
package de.woelki_web.socialize;

/**
 *
 * @author Dominik Woelki
 */
public class DummySocializeEvent implements ISocializeEventListener {

    static ISocializeEventFeeder FEEDER;
    
    @Override
    public String getEventName() {
        return "Simple invitation";
    }

    @Override
    public void registerFeeder(ISocializeEventFeeder feeder) {
        FEEDER = feeder;
    }

    @Override
    public boolean receivedInvitation(String _invitationDescription) {
        final String answer = javax.swing.JOptionPane.showInputDialog(
            new javax.swing.JFrame(),
            "Invitation:\n\""+_invitationDescription+"\"\nPlease enter your answer:",
            "Invitation"
        );
        FEEDER.receiveAnswerOnInvitation(_invitationDescription, answer);
        return true;
    }
    
}
