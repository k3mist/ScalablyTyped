package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component that supports this service preserves XML attributes, unknown by its parser, that belong to the XML element representing it (the
  * component).
  * @since OOo 2.0.4
  */
trait ParaUserDefinedAttributesSupplier extends js.Object {
  /**
    * This container holds the {@link AttributeData} elements that represent uninterpreted XML attributes of a paragraph.
    *
    * The idea behind this property is that a parser can stow away all attributes that it cannot handle by itself on reading an XML file. When the file is
    * stored again, the unknown attributes can be written back without loss.
    *
    * The {@link com.sun.star.container.XNameContainer} supports the service {@link AttributeContainer} .
    */
  var ParaUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object ParaUserDefinedAttributesSupplier {
  @scala.inline
  def apply(ParaUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer): ParaUserDefinedAttributesSupplier = {
    val __obj = js.Dynamic.literal(ParaUserDefinedAttributes = ParaUserDefinedAttributes)
  
    __obj.asInstanceOf[ParaUserDefinedAttributesSupplier]
  }
}

