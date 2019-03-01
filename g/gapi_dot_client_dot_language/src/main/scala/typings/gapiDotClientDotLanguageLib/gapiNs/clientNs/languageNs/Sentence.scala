package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentence extends js.Object {
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to
    * true, this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  /** The sentence text. */
  var text: js.UndefOr[TextSpan] = js.undefined
}

object Sentence {
  @scala.inline
  def apply(sentiment: Sentiment = null, text: TextSpan = null): Sentence = {
    val __obj = js.Dynamic.literal()
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Sentence]
  }
}

