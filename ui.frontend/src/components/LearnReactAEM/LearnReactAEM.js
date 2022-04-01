import React, {Component} from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';

export const LearnReactAEMConfig = {

    emptyLabel: 'LearnReactAEM',

    isEmpty: function(props) {
        return !props || !props.displayText || props.displayText.trim().length < 1;
    }
};

export default class LearnReactAEM extends Component {

    render() {
        if(LearnReactAEMConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div className="LearnReactAEM-Component">
                <h2 className="LearnReactAEM-Component__message">{this.props.displayText}</h2>
            </div>
        );
    }
}

MapTo('wknd-spa-react/components/learning-react')(LearnReactAEM, LearnReactAEMConfig);
