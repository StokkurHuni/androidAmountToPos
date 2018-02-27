package is.valitor.library.android.request;

import is.valitor.library.android.MessageDeliveredRequest;
import is.valitor.library.android.CardType;
import is.valitor.library.android.MsgType;

public abstract class RefundRequest
        extends MessageDeliveredRequest {

    public RefundRequest(int amount,
                         String currency,
                         boolean print,
                         CardType cardType,
                         boolean status) {
        super(MsgType.AUTH_REFUND_REQUEST, amount, currency, print, cardType, status);
    }

}
