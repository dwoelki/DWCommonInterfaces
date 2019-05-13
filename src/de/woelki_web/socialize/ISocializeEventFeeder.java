/* CHANGELOG
 * 2019-04-19   DW  Creation
 * 2019-04-19   DW  Declaration sendInvitation
 * 2019-05-13   DW  Declaration public void receiveAnswerOnInvitation
 */
package de.woelki_web.socialize;

/**
 * Interface-description:<br>
 * ...
 * 
 * @author Dominik Woelki
 */
public interface ISocializeEventFeeder {
    
    public boolean sendInvitation(String _invitationDescription);
    
    public void receiveAnswerOnInvitation(String _originalInvitationDescription, Object _answerObject);
    
}
