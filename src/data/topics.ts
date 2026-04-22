export interface TopicData {
    [key: string]: {
        name: string;
        cheatsheet?: boolean;
        guide?: boolean;
        questions?: boolean;
    };
};

export const topics: TopicData = {
    ascii: {
        name: "ASCII",
        cheatsheet: true,
    },
    bases: {
        name: "Bases",
        cheatsheet: true,
        guide: true,
        questions: true,
    },
    bigo: {
        name: "Big O Notation",
        cheatsheet: true,
    },
    boxing: {
        name: "Autoboxing/Unboxing",
        cheatsheet: true,
    },
    math: {
        name: "Mathematical Concepts",
        cheatsheet: true,
        questions: true,
    }, 
    precedence: {
        name: "Operator Precedence",
        cheatsheet: true,
        questions: true,
    }, 
    primitives: {
        name: "Primitive Data Types",
        cheatsheet: true,
    }, 
    strings: {
        name: "Strings",
        cheatsheet: true,
        questions: true,
    },
    switch: {
        name: "Switch Statements",
        cheatsheet: true,
    }
};

// export const topics: TopicScores = {
//     ascii: 100,
//     bases: 111,
//     bigo: 100,
//     math: 101,
//     precedence: 101,
//     primitives: 100,
//     strings: 101
// };