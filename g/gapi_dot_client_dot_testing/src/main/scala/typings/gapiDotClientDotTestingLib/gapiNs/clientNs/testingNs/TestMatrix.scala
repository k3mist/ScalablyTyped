package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    * Optional
    */
  var clientInfo: js.UndefOr[ClientInfo] = js.undefined
  /**
    * How the host machine(s) are configured.
    * Required
    */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.undefined
  /**
    * Describes why the matrix is considered invalid.
    * Only useful for matrices in the INVALID state.
    * @OutputOnly
    */
  var invalidMatrixDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cloud project that owns the test matrix.
    * @OutputOnly
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where the results for the matrix are written.
    * Required
    */
  var resultStorage: js.UndefOr[ResultStorage] = js.undefined
  /**
    * Indicates the current progress of the test matrix (e.g., FINISHED)
    * @OutputOnly
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of test executions that the service creates for this matrix.
    * @OutputOnly
    */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.undefined
  /**
    * Unique id set by the service.
    * @OutputOnly
    */
  var testMatrixId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How to run the test.
    * Required
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  /**
    * The time this test matrix was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object TestMatrix {
  @scala.inline
  def apply(
    clientInfo: ClientInfo = null,
    environmentMatrix: EnvironmentMatrix = null,
    invalidMatrixDetails: java.lang.String = null,
    projectId: java.lang.String = null,
    resultStorage: ResultStorage = null,
    state: java.lang.String = null,
    testExecutions: js.Array[TestExecution] = null,
    testMatrixId: java.lang.String = null,
    testSpecification: TestSpecification = null,
    timestamp: java.lang.String = null
  ): TestMatrix = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo)
    if (environmentMatrix != null) __obj.updateDynamic("environmentMatrix")(environmentMatrix)
    if (invalidMatrixDetails != null) __obj.updateDynamic("invalidMatrixDetails")(invalidMatrixDetails)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (resultStorage != null) __obj.updateDynamic("resultStorage")(resultStorage)
    if (state != null) __obj.updateDynamic("state")(state)
    if (testExecutions != null) __obj.updateDynamic("testExecutions")(testExecutions)
    if (testMatrixId != null) __obj.updateDynamic("testMatrixId")(testMatrixId)
    if (testSpecification != null) __obj.updateDynamic("testSpecification")(testSpecification)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[TestMatrix]
  }
}

