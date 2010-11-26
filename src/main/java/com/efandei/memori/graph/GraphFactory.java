/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.efandei.memori.graph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.efandei.memori.graph.GraphPackage
 * @generated
 */
public interface GraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphFactory eINSTANCE = com.efandei.memori.graph.impl.GraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intf</em>'.
	 * @generated
	 */
	GraphIntf createGraphIntf();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphPackage getGraphPackage();

} //GraphFactory
