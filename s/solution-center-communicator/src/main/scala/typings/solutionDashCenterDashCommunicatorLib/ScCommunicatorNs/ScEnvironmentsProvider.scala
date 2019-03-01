package typings
package solutionDashCenterDashCommunicatorLib.ScCommunicatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScEnvironmentsProvider extends js.Object {
  /**
    * Access to the public methods of the service
    */
  @JSName("$get")
  def $get(): js.Any
  /**
    * Get current environment
    * If environment was not previously configured, use default environment
    *
    * @public
    * @returns {Object} Current or default environment
    */
  def getCurrentEnvironment(): Environment
  /**
    * Get specific environment
    *
    * @public
    * @param {string} name - Environment name
    * @returns {Object} Specific or default environment
    */
  def getSpecificEnvironment(name: java.lang.String): Environment
  /**
    * Set current environment
    *
    * @public
    * @param {string|Object} env - Environment name or custom environment object
    * @returns {Object} Named or custom environment
    */
  def setCurrentEnvironment(env: js.Any): Environment
}

object ScEnvironmentsProvider {
  @scala.inline
  def apply(
    $get: js.Function0[js.Any],
    getCurrentEnvironment: js.Function0[Environment],
    getSpecificEnvironment: js.Function1[java.lang.String, Environment],
    setCurrentEnvironment: js.Function1[js.Any, Environment]
  ): ScEnvironmentsProvider = {
    val __obj = js.Dynamic.literal($get = $get, getCurrentEnvironment = getCurrentEnvironment, getSpecificEnvironment = getSpecificEnvironment, setCurrentEnvironment = setCurrentEnvironment)
  
    __obj.asInstanceOf[ScEnvironmentsProvider]
  }
}

