
package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *Impelemntation des Servicetask "Tweet usehaue"
 * @author peyerseb
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * 1. blablabla
     * @param de Objekt welches die Verknüpfung zur Prozessengine und aktuellen execution enthält
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String) de.getVariable("tweetContent");
        System.out.println("Folgender Tweet wird veröffentlicht" + tweetContent);
    }
    
}
