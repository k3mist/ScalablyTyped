package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCharacterData extends XNode {
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: scala.Double
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: java.lang.String): scala.Unit
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): scala.Double
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: scala.Double, count: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: java.lang.String): scala.Unit
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: scala.Double, count: scala.Double): java.lang.String
}

object XCharacterData {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: java.lang.String,
    FirstChild: XNode,
    LastChild: XNode,
    Length: scala.Double,
    LocalName: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: XNode,
    NodeName: java.lang.String,
    NodeType: NodeType,
    NodeValue: java.lang.String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: java.lang.String,
    PreviousSibling: XNode,
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    appendData: js.Function1[java.lang.String, scala.Unit],
    cloneNode: js.Function1[scala.Boolean, XNode],
    deleteData: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getData: js.Function0[java.lang.String],
    getFirstChild: js.Function0[XNode],
    getLastChild: js.Function0[XNode],
    getLength: js.Function0[scala.Double],
    getLocalName: js.Function0[java.lang.String],
    getNamespaceURI: js.Function0[java.lang.String],
    getNextSibling: js.Function0[XNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeType: js.Function0[NodeType],
    getNodeValue: js.Function0[java.lang.String],
    getOwnerDocument: js.Function0[XDocument],
    getParentNode: js.Function0[XNode],
    getPrefix: js.Function0[java.lang.String],
    getPreviousSibling: js.Function0[XNode],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    insertBefore: js.Function2[XNode, XNode, XNode],
    insertData: js.Function2[scala.Double, java.lang.String, scala.Unit],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    replaceData: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    setData: js.Function1[java.lang.String, scala.Unit],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit],
    subStringData: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): XCharacterData = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Data = Data, FirstChild = FirstChild, LastChild = LastChild, Length = Length, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, acquire = acquire, appendChild = appendChild, appendData = appendData, cloneNode = cloneNode, deleteData = deleteData, getAttributes = getAttributes, getChildNodes = getChildNodes, getData = getData, getFirstChild = getFirstChild, getLastChild = getLastChild, getLength = getLength, getLocalName = getLocalName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, insertData = insertData, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, replaceData = replaceData, setData = setData, setNodeValue = setNodeValue, setPrefix = setPrefix, subStringData = subStringData)
  
    __obj.asInstanceOf[XCharacterData]
  }
}

