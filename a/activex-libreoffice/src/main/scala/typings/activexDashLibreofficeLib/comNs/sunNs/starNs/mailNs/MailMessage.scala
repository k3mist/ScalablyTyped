package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since OOo 2.0 */
trait MailMessage extends XMailMessage {
  /**
    * Constructs an instance of a mail message.
    * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
    * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
    * @param sSubject [in] the subject of the mail message.
    * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
    * @see com.sun.star.mail.XMailMessage
    * @see com.sun.star.datatransfer.XTransferable
    */
  def create(
    sTo: java.lang.String,
    sFrom: java.lang.String,
    sSubject: java.lang.String,
    xBody: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  ): scala.Unit
  /**
    * Constructs an instance of a mail message.
    * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
    * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
    * @param sSubject [in] the subject of the mail message.
    * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
    * @param aMailAttachment [in] specifies an attachment which should be send with this mail message.
    * @see com.sun.star.mail.XMailMessage
    * @see com.sun.star.datatransfer.XTransferable
    * @see com.sun.star.mail.MailAttachment
    */
  def createWithAttachment(
    sTo: java.lang.String,
    sFrom: java.lang.String,
    sSubject: java.lang.String,
    xBody: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    aMailAttachment: MailAttachment
  ): scala.Unit
}

object MailMessage {
  @scala.inline
  def apply(
    Attachments: activexDashInteropLib.SafeArray[MailAttachment],
    BccRecipients: activexDashInteropLib.SafeArray[java.lang.String],
    Body: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    CcRecipients: activexDashInteropLib.SafeArray[java.lang.String],
    Recipients: activexDashInteropLib.SafeArray[java.lang.String],
    ReplyToAddress: java.lang.String,
    SenderAddress: java.lang.String,
    SenderName: java.lang.String,
    Subject: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addAttachment: js.Function1[MailAttachment, scala.Unit],
    addBccRecipient: js.Function1[java.lang.String, scala.Unit],
    addCcRecipient: js.Function1[java.lang.String, scala.Unit],
    addRecipient: js.Function1[java.lang.String, scala.Unit],
    create: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      scala.Unit
    ],
    createWithAttachment: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      MailAttachment, 
      scala.Unit
    ],
    getAttachments: js.Function0[activexDashInteropLib.SafeArray[MailAttachment]],
    getBccRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getCcRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, BccRecipients = BccRecipients, Body = Body, CcRecipients = CcRecipients, Recipients = Recipients, ReplyToAddress = ReplyToAddress, SenderAddress = SenderAddress, SenderName = SenderName, Subject = Subject, acquire = acquire, addAttachment = addAttachment, addBccRecipient = addBccRecipient, addCcRecipient = addCcRecipient, addRecipient = addRecipient, create = create, createWithAttachment = createWithAttachment, getAttachments = getAttachments, getBccRecipients = getBccRecipients, getCcRecipients = getCcRecipients, getRecipients = getRecipients, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[MailMessage]
  }
}

