package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var confidence: scala.Double
  var page: Page
  var paragraph: Paragraph
  var symbols: js.Array[Symbol]
  var text: java.lang.String
  var words: js.Array[Word]
}

object Line {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: scala.Double,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: java.lang.String,
    words: js.Array[Word]
  ): Line = {
    val __obj = js.Dynamic.literal(baseline = baseline, bbox = bbox, block = block, confidence = confidence, page = page, paragraph = paragraph, symbols = symbols, text = text, words = words)
  
    __obj.asInstanceOf[Line]
  }
}

