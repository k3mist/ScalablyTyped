package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
trait ResourceId extends XResourceId {
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: java.lang.String): scala.Unit
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): scala.Unit
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: java.lang.String, xAnchor: XResourceId): scala.Unit
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: java.lang.String, sAnchorURL: java.lang.String): scala.Unit
}

object ResourceId {
  @scala.inline
  def apply(
    Anchor: XResourceId,
    AnchorURLs: activexDashInteropLib.SafeArray[java.lang.String],
    FullResourceURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    ResourceTypePrefix: java.lang.String,
    ResourceURL: java.lang.String,
    clone: js.Function0[XResourceId],
    compareTo: js.Function1[XResourceId, scala.Double],
    create: js.Function1[java.lang.String, scala.Unit],
    createEmpty: js.Function0[scala.Unit],
    createWithAnchor: js.Function2[java.lang.String, XResourceId, scala.Unit],
    createWithAnchorURL: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    getAnchor: js.Function0[XResourceId],
    getAnchorURLs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getFullResourceURL: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL],
    getResourceTypePrefix: js.Function0[java.lang.String],
    getResourceURL: js.Function0[java.lang.String],
    hasAnchor: js.Function0[scala.Boolean],
    isBoundTo: js.Function2[XResourceId, AnchorBindingMode, scala.Boolean],
    isBoundToURL: js.Function2[java.lang.String, AnchorBindingMode, scala.Boolean]
  ): ResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorURLs = AnchorURLs, FullResourceURL = FullResourceURL, ResourceTypePrefix = ResourceTypePrefix, ResourceURL = ResourceURL, clone = clone, compareTo = compareTo, create = create, createEmpty = createEmpty, createWithAnchor = createWithAnchor, createWithAnchorURL = createWithAnchorURL, getAnchor = getAnchor, getAnchorURLs = getAnchorURLs, getFullResourceURL = getFullResourceURL, getResourceTypePrefix = getResourceTypePrefix, getResourceURL = getResourceURL, hasAnchor = hasAnchor, isBoundTo = isBoundTo, isBoundToURL = isBoundToURL)
  
    __obj.asInstanceOf[ResourceId]
  }
}

