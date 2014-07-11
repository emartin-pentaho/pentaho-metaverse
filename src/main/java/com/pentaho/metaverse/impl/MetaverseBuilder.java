/*!
 * PENTAHO CORPORATION PROPRIETARY AND CONFIDENTIAL
 *
 * Copyright 2002 - 2014 Pentaho Corporation (Pentaho). All rights reserved.
 *
 * NOTICE: All information including source code contained herein is, and
 * remains the sole property of Pentaho and its licensors. The intellectual
 * and technical concepts contained herein are proprietary and confidential
 * to, and are trade secrets of Pentaho and may be covered by U.S. and foreign
 * patents, or patents in process, and are protected by trade secret and
 * copyright laws. The receipt or possession of this source code and/or related
 * information does not convey or imply any rights to reproduce, disclose or
 * distribute its contents, or to manufacture, use, or sell anything that it
 * may describe, in whole or in part. Any reproduction, modification, distribution,
 * or public display of this information without the express written authorization
 * from Pentaho is strictly prohibited and in violation of applicable laws and
 * international treaties. Access to the source code contained herein is strictly
 * prohibited to anyone except those individuals and entities who have executed
 * confidentiality and non-disclosure agreements or other agreements with Pentaho,
 * explicitly covering such access.
 */

package com.pentaho.metaverse.impl;

import org.pentaho.platform.api.metaverse.IMetaverseBuilder;
import org.pentaho.platform.api.metaverse.IMetaverseDocument;
import org.pentaho.platform.api.metaverse.IMetaverseLink;
import org.pentaho.platform.api.metaverse.IMetaverseNode;
import org.pentaho.platform.api.metaverse.IMetaverseObjectFactory;

/**
 * @author mburgess
 *
 */
public class MetaverseBuilder implements IMetaverseBuilder, IMetaverseObjectFactory {

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#addLink(org.pentaho.platform.api.metaverse.IMetaverseLink)
   */
  @Override
  public IMetaverseBuilder addLink( IMetaverseLink arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#addNode(org.pentaho.platform.api.metaverse.IMetaverseNode)
   */
  @Override
  public IMetaverseBuilder addNode( IMetaverseNode arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#deleteLink(org.pentaho.platform.api.metaverse.IMetaverseLink)
   */
  @Override
  public IMetaverseBuilder deleteLink( IMetaverseLink arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#deleteNode(org.pentaho.platform.api.metaverse.IMetaverseNode)
   */
  @Override
  public IMetaverseBuilder deleteNode( IMetaverseNode arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#updateLink(org.pentaho.platform.api.metaverse.IMetaverseLink)
   */
  @Override
  public IMetaverseBuilder updateLink( IMetaverseLink arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseBuilder#updateNode(org.pentaho.platform.api.metaverse.IMetaverseNode)
   */
  @Override
  public IMetaverseBuilder updateNode( IMetaverseNode arg0 ) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseObjectFactory#createDocumentObject()
   */
  @Override
  public IMetaverseDocument createDocumentObject() {
    return new MetaverseDocument();
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseObjectFactory#createLinkObject()
   */
  @Override
  public IMetaverseLink createLinkObject() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.platform.api.metaverse.IMetaverseObjectFactory#createNodeObject()
   */
  @Override
  public IMetaverseNode createNodeObject() {
    return new MetaverseNode();
  }

}