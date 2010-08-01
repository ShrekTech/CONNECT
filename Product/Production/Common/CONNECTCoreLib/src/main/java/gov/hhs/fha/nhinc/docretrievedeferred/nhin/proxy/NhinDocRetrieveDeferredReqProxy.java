package gov.hhs.fha.nhinc.docretrievedeferred.nhin.proxy;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.common.nhinccommon.NhinTargetSystemType;
import gov.hhs.fha.nhinc.common.nhinccommonadapter.RespondingGatewayCrossGatewayRetrieveSecuredRequestType;
import gov.hhs.healthit.nhin.DocRetrieveAcknowledgementType;
import oasis.names.tc.emergency.edxl.de._1.EDXLDistribution;

/**
 * Created by
 * User: ralph
 * Date: Jul 26, 2010
 * Time: 1:34:33 PM
 */
public interface NhinDocRetrieveDeferredReqProxy {

    public DocRetrieveAcknowledgementType sendToRespondingGateway(RespondingGatewayCrossGatewayRetrieveSecuredRequestType body, AssertionType assertion);
}