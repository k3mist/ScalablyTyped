package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestion extends js.Object {
  /** The randomization option for multiple choice and multi-select questions. If not specified, this option defaults to randomize. */
  var answerOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Required list of answer options for a question. */
  var answers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Option to allow open-ended text box for Single Answer and Multiple Answer question types. This can be used with SINGLE_ANSWER,
    * SINGLE_ANSWER_WITH_IMAGE, MULTIPLE_ANSWERS, and MULTIPLE_ANSWERS_WITH_IMAGE question types.
    */
  var hasOther: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For rating questions, the text for the higher end of the scale, such as 'Best'. For numeric questions, a string representing a floating-point that is
    * the maximum allowed number for a response.
    */
  var highValueLabel: js.UndefOr[java.lang.String] = js.undefined
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.undefined
  /** Currently only support pinning an answer option to the last position. */
  var lastAnswerPositionPinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For rating questions, the text for the lower end of the scale, such as 'Worst'. For numeric questions, a string representing a floating-point that is
    * the minimum allowed number for a response.
    */
  var lowValueLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Option to force the user to pick one of the open text suggestions. This requires that suggestions are provided for this question. */
  var mustPickSuggestion: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of stars to use for ratings questions. */
  var numStars: js.UndefOr[java.lang.String] = js.undefined
  /** Placeholder text for an open text question. */
  var openTextPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /** A list of suggested answers for open text question auto-complete. This is only valid if single_line_response is true. */
  var openTextSuggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Required question text shown to the respondent. */
  var question: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used by the Rating Scale with Text question type. This text goes along with the question field that is presented to the respondent, and is the actual
    * text that the respondent is asked to rate.
    */
  var sentimentText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Option to allow multiple line open text responses instead of a single line response. Note that we don't show auto-complete suggestions with multiple
    * line responses.
    */
  var singleLineResponse: js.UndefOr[scala.Boolean] = js.undefined
  /** The threshold/screener answer options, which will screen a user into the rest of the survey. These will be a subset of the answer option strings. */
  var thresholdAnswers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Required field defining the question type. For details about configuring different type of questions, consult the question configuration guide. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Optional unit of measurement for display (for example: hours, people, miles). */
  var unitOfMeasurementLabel: js.UndefOr[java.lang.String] = js.undefined
  /** The YouTube video ID to be show in video questions. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyQuestion {
  @scala.inline
  def apply(
    answerOrder: java.lang.String = null,
    answers: js.Array[java.lang.String] = null,
    hasOther: js.UndefOr[scala.Boolean] = js.undefined,
    highValueLabel: java.lang.String = null,
    images: js.Array[SurveyQuestionImage] = null,
    lastAnswerPositionPinned: js.UndefOr[scala.Boolean] = js.undefined,
    lowValueLabel: java.lang.String = null,
    mustPickSuggestion: js.UndefOr[scala.Boolean] = js.undefined,
    numStars: java.lang.String = null,
    openTextPlaceholder: java.lang.String = null,
    openTextSuggestions: js.Array[java.lang.String] = null,
    question: java.lang.String = null,
    sentimentText: java.lang.String = null,
    singleLineResponse: js.UndefOr[scala.Boolean] = js.undefined,
    thresholdAnswers: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null,
    unitOfMeasurementLabel: java.lang.String = null,
    videoId: java.lang.String = null
  ): SurveyQuestion = {
    val __obj = js.Dynamic.literal()
    if (answerOrder != null) __obj.updateDynamic("answerOrder")(answerOrder)
    if (answers != null) __obj.updateDynamic("answers")(answers)
    if (!js.isUndefined(hasOther)) __obj.updateDynamic("hasOther")(hasOther)
    if (highValueLabel != null) __obj.updateDynamic("highValueLabel")(highValueLabel)
    if (images != null) __obj.updateDynamic("images")(images)
    if (!js.isUndefined(lastAnswerPositionPinned)) __obj.updateDynamic("lastAnswerPositionPinned")(lastAnswerPositionPinned)
    if (lowValueLabel != null) __obj.updateDynamic("lowValueLabel")(lowValueLabel)
    if (!js.isUndefined(mustPickSuggestion)) __obj.updateDynamic("mustPickSuggestion")(mustPickSuggestion)
    if (numStars != null) __obj.updateDynamic("numStars")(numStars)
    if (openTextPlaceholder != null) __obj.updateDynamic("openTextPlaceholder")(openTextPlaceholder)
    if (openTextSuggestions != null) __obj.updateDynamic("openTextSuggestions")(openTextSuggestions)
    if (question != null) __obj.updateDynamic("question")(question)
    if (sentimentText != null) __obj.updateDynamic("sentimentText")(sentimentText)
    if (!js.isUndefined(singleLineResponse)) __obj.updateDynamic("singleLineResponse")(singleLineResponse)
    if (thresholdAnswers != null) __obj.updateDynamic("thresholdAnswers")(thresholdAnswers)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unitOfMeasurementLabel != null) __obj.updateDynamic("unitOfMeasurementLabel")(unitOfMeasurementLabel)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[SurveyQuestion]
  }
}

