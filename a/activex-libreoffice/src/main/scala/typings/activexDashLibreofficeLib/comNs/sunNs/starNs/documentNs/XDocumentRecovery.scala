package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface to be implemented by documents who wish to participate in the document emergency-save / recovery process. */
trait XDocumentRecovery extends js.Object {
  /**
    * recovers the document after a previous emergency or session save.
    *
    * The document itself has previously been created, but **not** loaded (via {@link com.sun.star.frame.XLoadable.load()} ) or initialized (via {@link
    * com.sun.star.frame.XLoadable.initNew()} ).
    *
    * Upon successful return, the document must be fully initialized. In particular, the caller is not responsible for calling {@link
    * com.sun.star.frame.XModel.attachResource()} . Instead, the implementation is responsible to do so, if required.
    *
    * A default implementation of this method could simply delegate this call to {@link com.sun.star.frame.XLoadable.load()} , followed by {@link
    * com.sun.star.frame.XModel.attachResource()} .
    * @param SourceLocation specifies the URL of the location to which the document was previously emergency-saved.
    * @param SalvagedFile specifies the original URL of the file which had been emergency-saved. If this is empty, then the file should be recovered from its
    * @param MediaDescriptor contains additional arguments for the load process, for instance an StatusIndicator.
    * @see MediaDescriptor
    */
  def recoverFromFile(
    SourceLocation: java.lang.String,
    SalvagedFile: java.lang.String,
    MediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * does an emergency save of the document
    *
    * A default implementation of this method could simply delegate this call to {@link com.sun.star.frame.XStorable.storeToURL()} .
    * @param TargetLocation specifies the URL of the location to which the document should be emergency-saved.
    * @param MediaDescriptor contains additional arguments for the save process, for instance an StatusIndicator.
    * @see MediaDescriptor
    */
  def storeToRecoveryFile(
    TargetLocation: java.lang.String,
    MediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * determines whether the document has been modified since the last call to {@link storeToRecoveryFile()} .
    *
    * If `storeToRecoveryFile` has not been called before, this method returns whether the document has been modified since it has been loaded respectively
    * created.
    *
    * When saving a session, either in case of a emergency (when OpenOffice.org crashed), or during a periodic session save as configured by the user,
    * {@link storeToRecoveryFile()} is called for every document where `wasModifiedSinceLastSave` returns `TRUE` .
    *
    * It's allowed to implement this method sloppy, by returning `TRUE` in cases where it is not sure whether the document actually has been modified. So,
    * the most simple implementation could simply delegate this call to {@link com.sun.star.util.XModifiable.isModified()} . (Well, actually that's the
    * second simple implementation, the **most** simple one would, still legitimately, always return `TRUE` .)
    *
    * However, in such a case, the document might be saved more often than needed. In particular during the periodic session save, this might become a
    * problem when saving is expensive, for a single document or the sum of all open documents.
    */
  def wasModifiedSinceLastSave(): scala.Boolean
}

object XDocumentRecovery {
  @scala.inline
  def apply(
    recoverFromFile: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeToRecoveryFile: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    wasModifiedSinceLastSave: js.Function0[scala.Boolean]
  ): XDocumentRecovery = {
    val __obj = js.Dynamic.literal(recoverFromFile = recoverFromFile, storeToRecoveryFile = storeToRecoveryFile, wasModifiedSinceLastSave = wasModifiedSinceLastSave)
  
    __obj.asInstanceOf[XDocumentRecovery]
  }
}

