package org.cloudname;

/**
 * This interface defines the callback interface used to notify of
 * config node changes.
 *
 * @author borud
 */

public interface ConfigListener {
    public enum Event {
        UPDATED,
        DELETED,
    }

    /**
     * @param name the name of the config node that was updated.
     * @param event the type of event observed on the config node.
     * @param data the contents of the config node
     */
    public void onConfigEvent(Event event, String name, String data);
}