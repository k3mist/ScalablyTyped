package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowView extends js.Object {
  var destroyed: scala.Boolean
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): scala.Unit
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): scala.Unit
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): scala.Unit
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): scala.Unit
  def addLabel(labelDescriptor: LabelDescriptor): scala.Unit
  def getContacts(): js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
  def getDateString(): java.lang.String
  def getDraftID(): js.Promise[java.lang.String]
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): java.lang.String
  def getThreadIDAsync(): js.Promise[java.lang.String]
  def getThreadIDIfStableAsync(): js.Promise[java.lang.String | scala.Null]
  def getVisibleDraftCount(): scala.Double
  def getVisibleMessageCount(): scala.Double
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): scala.Unit
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): scala.Unit
}

object ThreadRowView {
  @scala.inline
  def apply(
    addActionButton: js.Function1[ThreadRowActionButtonDescriptor, scala.Unit],
    addAttachmentIcon: js.Function1[ThreadRowAttachmentIconDescriptor, scala.Unit],
    addButton: js.Function1[ThreadRowButtonDescriptor, scala.Unit],
    addImage: js.Function1[ImageDescriptor, scala.Unit],
    addLabel: js.Function1[LabelDescriptor, scala.Unit],
    destroyed: scala.Boolean,
    getContacts: js.Function0[js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]],
    getDateString: js.Function0[java.lang.String],
    getDraftID: js.Function0[js.Promise[java.lang.String]],
    getSubject: js.Function0[java.lang.String],
    getThreadIDAsync: js.Function0[js.Promise[java.lang.String]],
    getThreadIDIfStableAsync: js.Function0[js.Promise[java.lang.String | scala.Null]],
    getVisibleDraftCount: js.Function0[scala.Double],
    getVisibleMessageCount: js.Function0[scala.Double],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    replaceDate: js.Function1[ThreadRowDateDescriptor, scala.Unit],
    replaceDraftLabel: js.Function1[ThreadRowDraftLabelDescriptor, scala.Unit]
  ): ThreadRowView = {
    val __obj = js.Dynamic.literal(addActionButton = addActionButton, addAttachmentIcon = addAttachmentIcon, addButton = addButton, addImage = addImage, addLabel = addLabel, destroyed = destroyed, getContacts = getContacts, getDateString = getDateString, getDraftID = getDraftID, getSubject = getSubject, getThreadIDAsync = getThreadIDAsync, getThreadIDIfStableAsync = getThreadIDIfStableAsync, getVisibleDraftCount = getVisibleDraftCount, getVisibleMessageCount = getVisibleMessageCount, on_destroy = on_destroy, replaceDate = replaceDate, replaceDraftLabel = replaceDraftLabel)
  
    __obj.asInstanceOf[ThreadRowView]
  }
}

