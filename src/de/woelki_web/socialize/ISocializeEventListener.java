/* CHANGELOG
 * 2019-04-19   DW  Creation
 * 2019-04-19   DW  First declarations
 */
package de.woelki_web.socialize;

/**
 * Interface-description:<br>
 * ...
 * 
 * @author Dominik Woelki
 */
public interface ISocializeEventListener {
    
    public String getEventName();
    public void registerFeeder(ISocializeEventFeeder feeder);
    public boolean receivedInvitation(String _invitationDescription);
    
}
