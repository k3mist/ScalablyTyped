package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Identifies the artifact that the analysis tool was instructed to scan. This need not be the same as the artifact
    * where the result actually occurred.
    */
  var analysisTarget: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * A set of artifacts relevant to the result.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * The state of a result relative to a baseline of a previous run.
    */
  var baselineState: js.UndefOr[sarifLib.sarifMod.ResultNs.baselineState] = js.undefined
  /**
    * An array of 'codeFlow' objects relevant to the result.
    */
  var codeFlows: js.UndefOr[js.Array[CodeFlow]] = js.undefined
  /**
    * A stable, unique identifier for the equivalence class of logically identical results to which this result
    * belongs, in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of strings each of which individually defines a stable, unique identity for the result.
    */
  var fingerprints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
    */
  var fixes: js.UndefOr[js.Array[Fix]] = js.undefined
  /**
    * An array of one or more unique 'graphTraversal' objects.
    */
  var graphTraversals: js.UndefOr[js.Array[GraphTraversal]] = js.undefined
  /**
    * A dictionary, each of whose keys is the id of a graph and each of whose values is a 'graph' object with that id.
    */
  var graphs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Graph]] = js.undefined
  /**
    * An absolute URI at which the result can be viewed.
    */
  var hostedViewerUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A stable, unique identifer for the result in the form of a GUID.
    */
  var instanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value that categorizes results by evaluation state.
    */
  var kind: js.UndefOr[sarifLib.sarifMod.ResultNs.kind] = js.undefined
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[sarifLib.sarifMod.ResultNs.level] = js.undefined
  /**
    * The set of locations where the result was detected. Specify only one location unless the problem indicated by
    * the result can only be corrected by making a change at every specified location.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /**
    * A message that describes the result. The first sentence of the message only will be displayed when visible space
    * is limited.
    */
  var message: Message
  /**
    * A positive integer specifying the number of times this logically unique result was observed in this run.
    */
  var occurrenceCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * A set of strings that contribute to the stable, unique identity of the result.
    */
  var partialFingerprints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Information about how and when the result was detected.
    */
  var provenance: js.UndefOr[ResultProvenance] = js.undefined
  /**
    * A number representing the priority or importance of the result.
    */
  var rank: js.UndefOr[scala.Double] = js.undefined
  /**
    * A set of locations relevant to this result.
    */
  var relatedLocations: js.UndefOr[js.Array[Location]] = js.undefined
  /**
    * The index within the run.tool.extensions array of the tool component object which describes the plug-in or tool
    * extension that produced the result.
    */
  var ruleExtensionIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be
    * used to retrieve rule metadata from the rules dictionary, if it exists.
    */
  var ruleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index within the run resources array of the rule object associated with this result.
    */
  var ruleIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of 'stack' objects relevant to the result.
    */
  var stacks: js.UndefOr[js.Array[Stack]] = js.undefined
  /**
    * A set of flags indicating one or more suppression conditions.
    */
  var suppressionStates: js.UndefOr[js.Array[sarifLib.sarifMod.ResultNs.suppressionStates]] = js.undefined
  /**
    * The URIs of the work items associated with this result.
    */
  var workItemUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    message: Message,
    analysisTarget: ArtifactLocation = null,
    attachments: js.Array[Attachment] = null,
    baselineState: sarifLib.sarifMod.ResultNs.baselineState = null,
    codeFlows: js.Array[CodeFlow] = null,
    correlationGuid: java.lang.String = null,
    fingerprints: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    fixes: js.Array[Fix] = null,
    graphTraversals: js.Array[GraphTraversal] = null,
    graphs: org.scalablytyped.runtime.StringDictionary[Graph] = null,
    hostedViewerUri: java.lang.String = null,
    instanceGuid: java.lang.String = null,
    kind: sarifLib.sarifMod.ResultNs.kind = null,
    level: sarifLib.sarifMod.ResultNs.level = null,
    locations: js.Array[Location] = null,
    occurrenceCount: scala.Int | scala.Double = null,
    partialFingerprints: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    properties: PropertyBag = null,
    provenance: ResultProvenance = null,
    rank: scala.Int | scala.Double = null,
    relatedLocations: js.Array[Location] = null,
    ruleExtensionIndex: scala.Int | scala.Double = null,
    ruleId: java.lang.String = null,
    ruleIndex: scala.Int | scala.Double = null,
    stacks: js.Array[Stack] = null,
    suppressionStates: js.Array[sarifLib.sarifMod.ResultNs.suppressionStates] = null,
    workItemUris: js.Array[java.lang.String] = null
  ): Result = {
    val __obj = js.Dynamic.literal(message = message)
    if (analysisTarget != null) __obj.updateDynamic("analysisTarget")(analysisTarget)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (baselineState != null) __obj.updateDynamic("baselineState")(baselineState)
    if (codeFlows != null) __obj.updateDynamic("codeFlows")(codeFlows)
    if (correlationGuid != null) __obj.updateDynamic("correlationGuid")(correlationGuid)
    if (fingerprints != null) __obj.updateDynamic("fingerprints")(fingerprints)
    if (fixes != null) __obj.updateDynamic("fixes")(fixes)
    if (graphTraversals != null) __obj.updateDynamic("graphTraversals")(graphTraversals)
    if (graphs != null) __obj.updateDynamic("graphs")(graphs)
    if (hostedViewerUri != null) __obj.updateDynamic("hostedViewerUri")(hostedViewerUri)
    if (instanceGuid != null) __obj.updateDynamic("instanceGuid")(instanceGuid)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (occurrenceCount != null) __obj.updateDynamic("occurrenceCount")(occurrenceCount.asInstanceOf[js.Any])
    if (partialFingerprints != null) __obj.updateDynamic("partialFingerprints")(partialFingerprints)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (provenance != null) __obj.updateDynamic("provenance")(provenance)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (relatedLocations != null) __obj.updateDynamic("relatedLocations")(relatedLocations)
    if (ruleExtensionIndex != null) __obj.updateDynamic("ruleExtensionIndex")(ruleExtensionIndex.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId)
    if (ruleIndex != null) __obj.updateDynamic("ruleIndex")(ruleIndex.asInstanceOf[js.Any])
    if (stacks != null) __obj.updateDynamic("stacks")(stacks)
    if (suppressionStates != null) __obj.updateDynamic("suppressionStates")(suppressionStates)
    if (workItemUris != null) __obj.updateDynamic("workItemUris")(workItemUris)
    __obj.asInstanceOf[Result]
  }
}

