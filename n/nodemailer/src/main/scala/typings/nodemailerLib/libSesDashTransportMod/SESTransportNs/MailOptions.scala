package typings
package nodemailerLib.libSesDashTransportMod.SESTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailOptions
  extends nodemailerLib.libMailerMod.MailNs.Options {
  /** All keys are added to the SendRawEmail method options */
  var ses: js.UndefOr[js.Object] = js.undefined
}

object MailOptions {
  @scala.inline
  def apply(
    alternatives: js.Array[nodemailerLib.libMailerMod.MailNs.Attachment] = null,
    attachments: js.Array[nodemailerLib.libMailerMod.MailNs.Attachment] = null,
    bcc: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.MailNs.Address]) = null,
    cc: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.MailNs.Address]) = null,
    date: stdLib.Date | java.lang.String = null,
    disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined,
    dkim: nodemailerLib.libDkimMod.DKIMNs.Options = null,
    encoding: java.lang.String = null,
    envelope: nodemailerLib.libMailerMod.MailNs.Envelope | nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope = null,
    from: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address = null,
    headers: nodemailerLib.libMailerMod.MailNs.Headers = null,
    html: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.MailNs.AttachmentLike = null,
    icalEvent: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.MailNs.IcalAttachment = null,
    inReplyTo: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address = null,
    list: nodemailerLib.libMailerMod.MailNs.ListHeaders = null,
    messageId: java.lang.String = null,
    normalizeHeaderKey: js.Function1[/* key */ java.lang.String, java.lang.String] = null,
    raw: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.MailNs.AttachmentLike = null,
    references: java.lang.String | js.Array[java.lang.String] = null,
    replyTo: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address = null,
    sender: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address = null,
    ses: js.Object = null,
    subject: java.lang.String = null,
    text: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.MailNs.AttachmentLike = null,
    textEncoding: nodemailerLib.libMailerMod.MailNs.TextEncoding = null,
    to: java.lang.String | nodemailerLib.libMailerMod.MailNs.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.MailNs.Address]) = null,
    watchHtml: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.MailNs.AttachmentLike = null
  ): MailOptions = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess)
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess)
    if (dkim != null) __obj.updateDynamic("dkim")(dkim)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(normalizeHeaderKey)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (ses != null) __obj.updateDynamic("ses")(ses)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailOptions]
  }
}

