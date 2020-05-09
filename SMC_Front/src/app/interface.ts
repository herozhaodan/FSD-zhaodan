export interface Training{
    name: string;
    years: number;
    numberOfTraining: number;
    specificTech: string;
    feeCharged: number;
}

export interface Company{
    name: string;
    turnOver: number;
    ceo: string;
    boardOfDirectors: string;
    listed: boolean;
    sector: string;
    briefWriteup: string;
    stockCodes: string[];
}