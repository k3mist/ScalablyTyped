package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents an element in a DOM document, a <Titanium.XML.Node> defined by a start-tag and end-tag (or an empty tag). Elements may have [attributes](Titanium.XML.Attr) associated with them.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-745549614) on Android and iOS with some non-standard extensions.
		 */
trait Element
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Attr](Titanium.XML.Attr) node.
  			 */
  val ATTRIBUTE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [CDATASection](Titanium.XML.CDATASection) node.
  			 */
  val CDATA_SECTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Comment](Titanium.XML.Comment) node.
  			 */
  val COMMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentFragment](Titanium.XML.DocumentFragment) node.
  			 */
  val DOCUMENT_FRAGMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Document](Titanium.XML.Document) node.
  			 */
  val DOCUMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentType](Titanium.XML.DocumentType) node.
  			 */
  val DOCUMENT_TYPE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Element](Titanium.XML.Element) node.
  			 */
  val ELEMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Entity](Titanium.XML.Entity) node.
  			 */
  val ENTITY_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [EntityReference](Titanium.XML.EntityReference) node.
  			 */
  val ENTITY_REFERENCE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Notation](Titanium.XML.Notation) node.
  			 */
  val NOTATION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
  			 */
  val PROCESSING_INSTRUCTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Text](Titanium.XML.Text) node.
  			 */
  val TEXT_NODE: scala.Double
  /**
  			 * A map of this node's attributes.
  			 */
  val attributes: NamedNodeMap
  /**
  			 * A <Titanium.XML.NodeList> of this node's children.
  			 */
  val childNodes: NodeList
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: java.lang.String
  /**
  			 * Namespace URI of this node.
  			 */
  val namespaceURI: java.lang.String
  /**
  			 * This node's next sibling.
  			 */
  val nextSibling: Node
  /**
  			 * Name of this node.
  			 */
  val nodeName: java.lang.String
  /**
  			 * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
  			 * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
  			 * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
  			 */
  val nodeType: scala.Double
  /**
  			 * Content (value) of this node.
  			 */
  var nodeValue: java.lang.String
  /**
  			 * This node's owning document.
  			 */
  val ownerDocument: Document
  /**
  			 * This node's parent node.
  			 */
  val parentNode: Node
  /**
  			 * Namespace prefix of this node.
  			 */
  var prefix: java.lang.String
  /**
  			 * This node's previous sibling.
  			 */
  val previousSibling: Node
  /**
  			 * The name of the element, as defined by its tag.
  			 */
  val tagName: java.lang.String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val text: java.lang.String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val textContent: java.lang.String
  /**
  			 * Appends the node `newChild` as a child of this node.
  			 */
  def appendChild(newChild: Node): Node
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: scala.Boolean): Node
  /**
  			 * Retrieves an attribute value by name, returning it as a string.
  			 */
  def getAttribute(name: java.lang.String): java.lang.String
  /**
  			 * Retrieves an attribute value by local name and namespace URI, returning it as a string.
  			 */
  def getAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): java.lang.String
  /**
  			 * Retrieves an attribute value by name, returning it as a <Titanium.XML.Attr> object.
  			 */
  def getAttributeNode(name: java.lang.String): Attr
  /**
  			 * Retrieves an attribute value by local name and namespace URI, returning it as a <Titanium.XML.Attr> object.
  			 */
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr
  /**
  			 * Gets the value of the <Titanium.XML.Element.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given tag name, in preorder traversal.
  			 */
  def getElementsByTagName(name: java.lang.String): NodeList
  /**
  			 * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given local name and namespace URI, in preorder traversal.
  			 */
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): NodeList
  /**
  			 * Gets the value of the <Titanium.XML.Element.tagName> property.
  			 */
  def getTagName(): java.lang.String
  /**
  			 * Determines whether or not an attribute with the given name is available in the element, or has a default value.
  			 */
  def hasAttribute(name: java.lang.String): scala.Boolean
  /**
  			 * Determines whether or not an attribute with the given name is available in the element, or has a default value.
  			 */
  def hasAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): scala.Boolean
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): scala.Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): scala.Boolean
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: java.lang.String, version: java.lang.String): scala.Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): scala.Unit
  /**
  			 * Removes an attribute by name. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
  			 */
  def removeAttribute(name: java.lang.String): scala.Unit
  /**
  			 * Removes an attribute by local name and namespace URI. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
  			 */
  def removeAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): scala.Unit
  /**
  			 * Removes the specified attribute node. If the removed attribute has a default value, it is replaced immediately, with the same namespace and local name as the removed attribute, if applicable. Throws an exception if the element is read-only, or the attribute is not an attribute of the element.
  			 */
  def removeAttributeNode(oldAttr: Attr): scala.Unit
  /**
  			 * Removes a child node from this node.
  			 */
  def removeChild(oldChild: Node): Node
  /**
  			 * Replaces the node `oldChild` with the node `newChild`.
  			 */
  def replaceChild(newChild: Node, oldChild: Node): Node
  /**
  			 * Adds a new attribute. Any attribute with the same name is replaced. Throws an exception if the element is read-only, or if the name contains an illegal character.
  			 */
  def setAttribute(name: java.lang.String, value: java.lang.String): scala.Unit
  /**
  			 * Adds a new attribute. Any attribute with the same local name and namespace URI is present on the element is replaced, with its prefix changed to that of the `qualifiedName` parameter. Throws an exception if the element is read-only, if the name contains an illegal character, or if the qualified name contains an error.
  			 */
  def setAttributeNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit
  /**
  			 * Adds a new attribute. Any attribute with the same `nodeName` as the argument is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
  			 */
  def setAttributeNode(newAttr: Attr): Attr
  /**
  			 * Adds a new attribute. Any attribute with the same local name and namespace URI is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
  			 */
  def setAttributeNodeNS(newAttr: Attr): Attr
}

object Element {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: scala.Double,
    CDATA_SECTION_NODE: scala.Double,
    COMMENT_NODE: scala.Double,
    DOCUMENT_FRAGMENT_NODE: scala.Double,
    DOCUMENT_NODE: scala.Double,
    DOCUMENT_TYPE_NODE: scala.Double,
    ELEMENT_NODE: scala.Double,
    ENTITY_NODE: scala.Double,
    ENTITY_REFERENCE_NODE: scala.Double,
    NOTATION_NODE: scala.Double,
    PROCESSING_INSTRUCTION_NODE: scala.Double,
    TEXT_NODE: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    appendChild: Node => Node,
    applyProperties: js.Any => scala.Unit,
    attributes: NamedNodeMap,
    bubbleParent: scala.Boolean,
    childNodes: NodeList,
    cloneNode: scala.Boolean => Node,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    firstChild: Node,
    getApiName: () => java.lang.String,
    getAttribute: java.lang.String => java.lang.String,
    getAttributeNS: (java.lang.String, java.lang.String) => java.lang.String,
    getAttributeNode: java.lang.String => Attr,
    getAttributeNodeNS: (java.lang.String, java.lang.String) => Attr,
    getAttributes: () => NamedNodeMap,
    getBubbleParent: () => scala.Boolean,
    getElementsByTagName: java.lang.String => NodeList,
    getElementsByTagNameNS: (java.lang.String, java.lang.String) => NodeList,
    getTagName: () => java.lang.String,
    hasAttribute: java.lang.String => scala.Boolean,
    hasAttributeNS: (java.lang.String, java.lang.String) => scala.Boolean,
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (Node, Node) => Node,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    lastChild: Node,
    localName: java.lang.String,
    namespaceURI: java.lang.String,
    nextSibling: Node,
    nodeName: java.lang.String,
    nodeType: scala.Double,
    nodeValue: java.lang.String,
    normalize: () => scala.Unit,
    ownerDocument: Document,
    parentNode: Node,
    prefix: java.lang.String,
    previousSibling: Node,
    removeAttribute: java.lang.String => scala.Unit,
    removeAttributeNS: (java.lang.String, java.lang.String) => scala.Unit,
    removeAttributeNode: Attr => scala.Unit,
    removeChild: Node => Node,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    replaceChild: (Node, Node) => Node,
    setAttribute: (java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNS: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNode: Attr => Attr,
    setAttributeNodeNS: Attr => Attr,
    setBubbleParent: scala.Boolean => scala.Unit,
    tagName: java.lang.String,
    text: java.lang.String,
    textContent: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Element = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE, CDATA_SECTION_NODE = CDATA_SECTION_NODE, COMMENT_NODE = COMMENT_NODE, DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE, DOCUMENT_NODE = DOCUMENT_NODE, DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE, ELEMENT_NODE = ELEMENT_NODE, ENTITY_NODE = ENTITY_NODE, ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE, NOTATION_NODE = NOTATION_NODE, PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE, TEXT_NODE = TEXT_NODE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, appendChild = js.Any.fromFunction1(appendChild), applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), fireEvent = js.Any.fromFunction2(fireEvent), firstChild = firstChild, getApiName = js.Any.fromFunction0(getApiName), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getTagName = js.Any.fromFunction0(getTagName), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), lastChild = lastChild, localName = localName, namespaceURI = namespaceURI, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setBubbleParent = js.Any.fromFunction1(setBubbleParent), tagName = tagName, text = text, textContent = textContent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Element]
  }
}

