package info.nightscout.androidaps.plugins.PumpDanaR.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mike on 20.07.2016.
 */
public class MsgHistoryRefill extends MsgHistoryAll {
    private static Logger log = LoggerFactory.getLogger(MsgHistoryRefill.class);
    public MsgHistoryRefill() {
        SetCommand(0x3108);
    }
    // Handle message taken from MsgHistoryAll
}
