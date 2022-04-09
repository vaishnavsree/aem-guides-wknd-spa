import React, {Component} from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';

export const AuthorConfig = {

//  Placeholder to be shown when component is drag and dropped to page
    emptyLabel: 'Author',

    isEmpty: function(props) {
        return !props || !props.firstName || props.firstName.trim().length < 1;
    }
};

export default class Author extends Component {

    render() {

        if(AuthorConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div className="Author-Component">
                <h2 className="Author-Component__message1">{this.props.firstName}</h2>
                <h2 className="Author-Component__message2">{this.props.lastName}</h2>
                <h2 className="Author-Component__message3">{this.props.isProfessor ? "Author is Professor" : "Author is not Professor" }</h2>
            </div>
        );
    }
}

MapTo('wknd-spa-react/components/author')(Author, AuthorConfig);
