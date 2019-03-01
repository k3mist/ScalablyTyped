package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeAdapter extends js.Object {
  /**
    * Copies attributes to the given element. Only attributes that are not yet present in the element are copied.
    *
    * @param recipient - Element to copy attributes into.
    * @param attrs - Attributes to copy.
    */
  def adoptAttributes(recipient: Element, attrs: js.Array[Attribute]): scala.Unit
  /**
    * Appends a child node to the given parent node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    */
  def appendChild(parentNode: ParentNode, newNode: Node): scala.Unit
  /**
    * Creates a comment node.
    *
    * @param data - Comment text.
    */
  def createCommentNode(data: java.lang.String): CommentNode
  /**
    * Creates a document node.
    */
  def createDocument(): Document
  /**
    * Creates a document fragment node.
    */
  def createDocumentFragment(): DocumentFragment
  /**
    * Creates an element node.
    *
    * @param tagName - Tag name of the element.
    * @param namespaceURI - Namespace of the element.
    * @param attrs - Attribute name-value pair array. Foreign attributes may contain `namespace` and `prefix` fields as well.
    */
  def createElement(tagName: java.lang.String, namespaceURI: java.lang.String, attrs: js.Array[Attribute]): Element
  /**
    * Removes a node from its parent.
    *
    * @param node - Node to remove.
    */
  def detachNode(node: Node): scala.Unit
  /**
    * Returns the given element's attributes in an array, in the form of name-value pairs.
    * Foreign attributes may contain `namespace` and `prefix` fields as well.
    *
    * @param element - Element.
    */
  def getAttrList(element: Element): js.Array[Attribute]
  /**
    * Returns the given node's children in an array.
    *
    * @param node - Node.
    */
  def getChildNodes(node: ParentNode): js.Array[Node]
  /**
    * Returns the given comment node's content.
    *
    * @param commentNode - Comment node.
    */
  def getCommentNodeContent(commentNode: CommentNode): java.lang.String
  /**
    * Returns [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    */
  def getDocumentMode(document: Document): DocumentMode
  /**
    * Returns the given document type node's name.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeName(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the given document type node's public identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodePublicId(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the given document type node's system identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeSystemId(doctypeNode: DocumentType): java.lang.String
  /**
    * Returns the first child of the given node.
    *
    * @param node - Node.
    */
  def getFirstChild(node: ParentNode): Node
  /**
    * Returns the given element's namespace.
    *
    * @param element - Element.
    */
  def getNamespaceURI(element: Element): java.lang.String
  /**
    * Returns the given node's parent.
    *
    * @param node - Node.
    */
  def getParentNode(node: Node): ParentNode
  /**
    * Returns the given element's tag name.
    *
    * @param element - Element.
    */
  def getTagName(element: Element): java.lang.String
  /**
    * Returns the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    */
  def getTemplateContent(templateElement: Element): DocumentFragment
  /**
    * Returns the given text node's content.
    *
    * @param textNode - Text node.
    */
  def getTextNodeContent(textNode: TextNode): java.lang.String
  /**
    * Inserts a child node to the given parent node before the given reference node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    * @param referenceNode -  Reference node.
    */
  def insertBefore(parentNode: ParentNode, newNode: Node, referenceNode: Node): scala.Unit
  /**
    * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
    * text node content. Otherwise, inserts a new text node with the given text.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    */
  def insertText(parentNode: ParentNode, text: java.lang.String): scala.Unit
  /**
    * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
    * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
    * the given text before the reference node.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    * @param referenceNode - Node to insert text before.
    */
  def insertTextBefore(parentNode: ParentNode, text: java.lang.String, referenceNode: Node): scala.Unit
  /**
    * Determines if the given node is a comment node.
    *
    * @param node - Node.
    */
  def isCommentNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is a document type node.
    *
    * @param node - Node.
    */
  def isDocumentTypeNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is an element.
    *
    * @param node - Node.
    */
  def isElementNode(node: Node): scala.Boolean
  /**
    * Determines if the given node is a text node.
    *
    * @param node - Node.
    */
  def isTextNode(node: Node): scala.Boolean
  /**
    * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    * @param mode - Document mode.
    */
  def setDocumentMode(document: Document, mode: DocumentMode): scala.Unit
  /**
    * Sets the document type. If the `document` already contains a document type node, the `name`, `publicId` and `systemId`
    * properties of this node will be updated with the provided values. Otherwise, creates a new document type node
    * with the given properties and inserts it into the `document`.
    *
    * @param document - Document node.
    * @param name -  Document type name.
    * @param publicId - Document type public identifier.
    * @param systemId - Document type system identifier.
    */
  def setDocumentType(document: Document, name: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): scala.Unit
  /**
    * Sets the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    * @param contentElement -  Content element.
    */
  def setTemplateContent(templateElement: Element, contentElement: DocumentFragment): scala.Unit
}

object TreeAdapter {
  @scala.inline
  def apply(
    adoptAttributes: js.Function2[Element, js.Array[Attribute], scala.Unit],
    appendChild: js.Function2[ParentNode, Node, scala.Unit],
    createCommentNode: js.Function1[java.lang.String, CommentNode],
    createDocument: js.Function0[Document],
    createDocumentFragment: js.Function0[DocumentFragment],
    createElement: js.Function3[java.lang.String, java.lang.String, js.Array[Attribute], Element],
    detachNode: js.Function1[Node, scala.Unit],
    getAttrList: js.Function1[Element, js.Array[Attribute]],
    getChildNodes: js.Function1[ParentNode, js.Array[Node]],
    getCommentNodeContent: js.Function1[CommentNode, java.lang.String],
    getDocumentMode: js.Function1[Document, DocumentMode],
    getDocumentTypeNodeName: js.Function1[DocumentType, java.lang.String],
    getDocumentTypeNodePublicId: js.Function1[DocumentType, java.lang.String],
    getDocumentTypeNodeSystemId: js.Function1[DocumentType, java.lang.String],
    getFirstChild: js.Function1[ParentNode, Node],
    getNamespaceURI: js.Function1[Element, java.lang.String],
    getParentNode: js.Function1[Node, ParentNode],
    getTagName: js.Function1[Element, java.lang.String],
    getTemplateContent: js.Function1[Element, DocumentFragment],
    getTextNodeContent: js.Function1[TextNode, java.lang.String],
    insertBefore: js.Function3[ParentNode, Node, Node, scala.Unit],
    insertText: js.Function2[ParentNode, java.lang.String, scala.Unit],
    insertTextBefore: js.Function3[ParentNode, java.lang.String, Node, scala.Unit],
    isCommentNode: js.Function1[Node, scala.Boolean],
    isDocumentTypeNode: js.Function1[Node, scala.Boolean],
    isElementNode: js.Function1[Node, scala.Boolean],
    isTextNode: js.Function1[Node, scala.Boolean],
    setDocumentMode: js.Function2[Document, DocumentMode, scala.Unit],
    setDocumentType: js.Function4[Document, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    setTemplateContent: js.Function2[Element, DocumentFragment, scala.Unit]
  ): TreeAdapter = {
    val __obj = js.Dynamic.literal(adoptAttributes = adoptAttributes, appendChild = appendChild, createCommentNode = createCommentNode, createDocument = createDocument, createDocumentFragment = createDocumentFragment, createElement = createElement, detachNode = detachNode, getAttrList = getAttrList, getChildNodes = getChildNodes, getCommentNodeContent = getCommentNodeContent, getDocumentMode = getDocumentMode, getDocumentTypeNodeName = getDocumentTypeNodeName, getDocumentTypeNodePublicId = getDocumentTypeNodePublicId, getDocumentTypeNodeSystemId = getDocumentTypeNodeSystemId, getFirstChild = getFirstChild, getNamespaceURI = getNamespaceURI, getParentNode = getParentNode, getTagName = getTagName, getTemplateContent = getTemplateContent, getTextNodeContent = getTextNodeContent, insertBefore = insertBefore, insertText = insertText, insertTextBefore = insertTextBefore, isCommentNode = isCommentNode, isDocumentTypeNode = isDocumentTypeNode, isElementNode = isElementNode, isTextNode = isTextNode, setDocumentMode = setDocumentMode, setDocumentType = setDocumentType, setTemplateContent = setTemplateContent)
  
    __obj.asInstanceOf[TreeAdapter]
  }
}

